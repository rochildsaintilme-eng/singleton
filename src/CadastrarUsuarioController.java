public class CadastrarUsuarioController {
    public void teste(){
        for (var usuario : BancoDeDados.getInstance().usuario.entrySet()){
            System.out.println(usuario.getValue().getNome);
        }
    }
}
