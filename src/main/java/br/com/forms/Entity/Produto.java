package br.com.forms.Entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "produtos")
@SequenceGenerator(name="sq", sequenceName = "sq_produtos", allocationSize = 1)
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "qtd_estoque")
    private Long qtdEstoque;
    @Column(name = "categoria")
    private String categoria;
    @Column(name = "preco")
    private Double preco;

    @Lob
    @Column(name = "imagem_base64", columnDefinition = "TEXT")
    private String imagemBase64;
}
