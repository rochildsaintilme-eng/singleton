public class Usuario {

    private long id;
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    public String getNome(){
        return nome;
    }

    public long getId() {
        return id;
    }

    public static void setId(long id) {
        this.id = id;
    }
}
