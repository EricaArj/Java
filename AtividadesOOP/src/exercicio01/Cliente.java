package exercicio01;

public class Cliente {

    private String nome;
    private String telefone;
    private String cpf;
    private String email;
    private String profissao;

    public Cliente(String nome, String telefone, String cpf, String email, String profissao) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
        this.profissao =profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setEndereco(String profissao) {
        this.profissao = profissao;
    }
    public void visualizar() {
    	System.out.println("Nome: " +this.nome);
    	System.out.println("Numero de Telefone: " +this.telefone);
    	System.out.println("CPF: " +this.cpf);
    	System.out.println("Email: " +this.email);
    	System.out.println("Profissão: " +this.profissao);
    }
    	
   
}