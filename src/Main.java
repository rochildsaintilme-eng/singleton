//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Usuario u1 = new Usuario("Kauan", "Kaua@gmail.com");
    Usuario u2 = new Usuario("Rochild", "Rochild@gmail.com");

    BancoDeDados.getInstance().salvar(u1);
    BancoDeDados.getInstance().salvar(u2);


    CadastrarUsuarioController c1 = new CadastrarUsuarioController();
    c1.teste();
}
