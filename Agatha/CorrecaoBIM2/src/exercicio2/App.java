package exercicio2;

public class App {
    public static void main(String[] args) throws Exception {
        // 1. Criar um objeto Login
        Login login = new Login();
        // Adicionar alguns usuários
        Usuario user1 = new Usuario("user1", "123");
        login.addUsuario(user1);
        Usuario user2 = new Usuario("user1", "456");
        login.addUsuario(user2);
        Usuario user3 = new Usuario("user1", "789");
        login.addUsuario(user3);
        // Listar todos os usuários
        login.addUsuario(user3);
        // 3. Listar todos os usuários
        login.imprimirUsuarios();
        // 4. Logar um usuário
        user1.setLogado(login.validarLogin("user1", "123"));
        // 5. verificar se um usuário está logado
        System.out.println("o usuario está logado" + login.usuarioLogado("user1"));
    }
}
