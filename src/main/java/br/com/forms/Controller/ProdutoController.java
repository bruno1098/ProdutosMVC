package br.com.forms.Controller;

import br.com.forms.Entity.Produto;
import br.com.forms.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public String listarProdutos(Model model) {
        List<Produto> produtos = produtoRepository.findAll();
        model.addAttribute("produtos", produtos);
        return "produtos/index";
    }

    @GetMapping("/novo")
    public String novoProdutoForm(Model model) {
        model.addAttribute("produto", new Produto());
        return "produtos/formulario";
    }

    @PostMapping
    public String salvarProduto(@ModelAttribute("produto") Produto produto,
                                @RequestParam("imagemFile") MultipartFile imagemFile) throws IOException {
        if (!imagemFile.isEmpty()) {
            String imagemBase64 = Base64.getEncoder().encodeToString(imagemFile.getBytes());
            produto.setImagemBase64(imagemBase64);
        }
        produtoRepository.save(produto);
        return "redirect:/produtos";
    }

    @PutMapping("/{id}")
    public String atualizarProduto(@PathVariable("id") Long id,
                                   @ModelAttribute("produto") Produto produto,
                                   @RequestParam("imagemFile") MultipartFile imagemFile,
                                   @RequestParam("imagemExistente") String imagemExistente) throws IOException {
        Produto produtoExistente = produtoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("ID inválido: " + id));

        if (!imagemFile.isEmpty()) {
            String imagemBase64 = Base64.getEncoder().encodeToString(imagemFile.getBytes());
            produtoExistente.setImagemBase64(imagemBase64);
        } else {

            produtoExistente.setImagemBase64(imagemExistente);
        }
        produtoExistente.setNome(produto.getNome());
        produtoExistente.setDescricao(produto.getDescricao());
        produtoExistente.setQtdEstoque(produto.getQtdEstoque());
        produtoExistente.setCategoria(produto.getCategoria());
        produtoExistente.setPreco(produto.getPreco());

        produtoRepository.save(produtoExistente);
        return "redirect:/produtos";
    }



    @DeleteMapping("/{id}")
    public String excluirProduto(@PathVariable("id") Long id) {
        System.out.println("Excluindo produto com ID: " + id); // Log para verificar o ID
        Produto produto = produtoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("ID inválido: " + id));
        produtoRepository.delete(produto);
        return "redirect:/produtos";
    }





    @GetMapping("/editar/{id}")
    public String editarProdutoForm(@PathVariable("id") Long id, Model model) {
        Produto produto = produtoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("ID inválido: " + id));
        model.addAttribute("produto", produto);
        return "produtos/formulario";
    }
}
