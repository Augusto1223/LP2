import java.util.List;
import java.util.ArrayList;

public class Usuario {
    protected String nome;
    private String cpf;
    private String senha;
    private List<Conta> contas;


public Usuario(String nome, String cpf, String senha){
    this.nome = nome;
    this.cpf = cpf;
    this.senha = senha;
    this.contas = new ArrayList<>();
}

public String getCpf(){
    return cpf;
}

public boolean autenticar(String senha){
    return this.senha.equals(senha);
}

public void adicionarConta(Conta conta){
    contas.add(conta);
}
public List<Conta> getContas(){
    return contas;
}

}
