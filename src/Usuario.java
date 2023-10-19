public class Usuario {
    private String Nome;
    private String Sobrenome;
    private String Email;
    private String Cargo;
    private String Telefone;
    private String Nome_Empresa;
    private String TamanhoEmpresa;
    private String Pais;
    private String Regiao;
    private String Idioma;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getNome_Empresa() {
        return Nome_Empresa;
    }

    public void setNome_Empresa(String nome_Empresa) {
        Nome_Empresa = nome_Empresa;
    }

    public String getTamanhoEmpresa() {
        return TamanhoEmpresa;
    }

    public void setTamanhoEmpresa(String tamanhoEmpresa) {
        TamanhoEmpresa = tamanhoEmpresa;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getRegiao() {
        return Regiao;
    }

    public void setRegiao(String regiao) {
        Regiao = regiao;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String idioma) {
        Idioma = idioma;
    }
    public void CriarUsuario(){}
    public void AlterarUsuario(){}
    public void ExcluirUsuario(){}
}
