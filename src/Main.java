public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.cadastrarUsuario("João Augusto" , "067.942.074-60" , "senha123");

        Usuario usuario = banco.autenticarUsuario("067.942.074-60" , "senha123");
        if(usuario != null){
            System.out.println("Usuário autenticado com sucesso.");

            Conta conta = new ContaCorrente("0001", 500.0 , usuario);
            usuario.adicionarConta(conta);

            conta.depositar(200.0);
            System.out.println("Saldo atual "+ conta.consultarSaldo());
        } else{
            System.out.println("Falha na autenticação.");
        }
    }
}
