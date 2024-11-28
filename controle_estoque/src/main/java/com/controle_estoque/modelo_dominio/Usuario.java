package com.controle_estoque.modelo_dominio;

import java.sql.Date;
import java.time.LocalDateTime;

public class Usuario {

    private Long id_Usuario;
    private String nome_Usuario;
    private String usuario;
    private Date data_nascimento;
    private String senha;
    private LocalDateTime ultimo_Login;
    private boolean estado;
    private Perfil perfil;

    public Usuario() {
        this.estado = true;
    }

    public Usuario(Long id_Usuario, String nome_Usuario, String usuario, Date data_nascimento, String senha,
            LocalDateTime ultimo_Login, boolean estado, Perfil perfil) {
        this.id_Usuario = id_Usuario;
        this.nome_Usuario = nome_Usuario;
        this.usuario = usuario;
        this.data_nascimento = data_nascimento;
        this.senha = senha;
        this.ultimo_Login = ultimo_Login;
        this.estado = true;
        this.perfil = perfil;
    }

    public Long getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(Long id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getNome_Usuario() {
        return nome_Usuario;
    }

    public void setNome_Usuario(String nome_Usuario) {
        this.nome_Usuario = nome_Usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getUltimo_Login() {
        return ultimo_Login;
    }

    public void setUltimo_Login(LocalDateTime ultimo_Loguin) {
        this.ultimo_Login = ultimo_Loguin;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id_Usuario == null) ? 0 : id_Usuario.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (id_Usuario == null) {
            if (other.id_Usuario != null)
                return false;
        } else if (!id_Usuario.equals(other.id_Usuario))
            return false;
        return true;
    }

    public void reset(){
        this.estado = true;
    }

    public void mudarEstado(){
        this.estado = !this.estado;
    }

}
