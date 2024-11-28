package com.controle_estoque.modelo_dominio;

public class Cliente {

    private Long id_cliente ;
    private String nome_cliente;
    private String endereco_cliente;
    private String cidade;
    private String bairro;
    private String cep;  
    private String uf; 
    private int tel;
    private String cnpj;
    
    public Cliente() {
    }

    public Cliente(Long id_cliente, String nome_cliente, String endereco_cliente, String cidade, String bairro,
            String cep, String uf, int tel, String cnpj) {
        this.id_cliente = id_cliente;
        this.nome_cliente = nome_cliente;
        this.endereco_cliente = endereco_cliente;
        this.cidade = cidade;
        this.bairro = bairro;
        this.cep = cep;
        this.uf = uf;
        this.tel = tel;
        this.cnpj = cnpj;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getEndereco_cliente() {
        return endereco_cliente;
    }

    public void setEndereco_cliente(String endereco_cliente) {
        this.endereco_cliente = endereco_cliente;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    
}
