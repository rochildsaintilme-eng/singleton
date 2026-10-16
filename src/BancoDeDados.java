import java.util.HashMap;

public class BancoDeDados {
    private static BancoDeDados instancia;
   private HashMap<Long, Usuario>usuarios = new HashMap<>();
   private Long ultimoIdUSUARIO = 0L;

    public class BancoDeDados() {
        public Object usuario;
    }

    public static BancoDeDados getInstance() {
        if (instancia == null) {
            instancia = new BancoDeDados();

        }
        return instancia;
    }
    public Usuario  salvar(Usuario usuario) {
        ultimoIdUSUARIO += 1;
        Usuario.setId(ultimoIdUSUARIO);
        usuarios.put(ultimoIdUSUARIO, usuario);
        usuarios.put(1L, usuario);

        return usuario;
    }
    public 
}