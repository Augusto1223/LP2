import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Usuario> usuarios;

    public Banco(){
        this.usuarios = new ArrayList<>();
    }

    public void cadastrarUsuario(String nome, String cpf, String senha ){
        usuarios.add(new Usuario(nome, cpf, senha));
    }

    public Usuario autenticarUsuario(String cpf, String senha){
        for (Usuario usuario : usuarios){
            if(usuario.getCpf().equals(cpf) && usuario.autenticar(senha)){
                return usuario;
            }
            
        }
        return null;
    }
}
