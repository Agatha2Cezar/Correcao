package exercicio2;

public class Usuario {
    private String username;
    private String password;
    private boolean logado;

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
        this.logado = false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }

    @Override
    public String toString() {
        return "Username: " + this.username + "\n"
                + "Senha:" + this.password + "\n"
                + "Logado?" + this.logado;
    }

}
