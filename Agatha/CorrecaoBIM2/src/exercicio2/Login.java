package exercicio2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Login {
    private HashMap<String, Usuario> usuarios;
    private Usuario user;

    public boolean validarLogin(String username, String password) {
        Usuario user = usuarios.get(username);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public boolean usuarioLogado(String username) {
        Usuario user = usuarios.get(username);
        if (user != null) {
            return user.isLogado();
        }
        return false;

    }

    public void usuarioLogout(String username) {
        user = usuarios.get(username);
        if (user != null) {
            user.setLogado(false);
            System.out.println("Usuario" + user.getUsername() + "agora não está logado!");
        }
    }

    public void addUsuario(Usuario user) {
        this.usuarios.put(user.getUsername(), user);
    }

    public void imprimirUsuarios() {
        Iterator<Entry<String, Usuario>> it = this.usuarios.entrySet().iterator();
        while (it.hasNext()) {
            Entry<String, Usuario> entrada = it.next();
            System.out.println(entrada.getValue().toString());
        }
    }
}
