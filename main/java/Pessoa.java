public class Pessoa {

    private String nome;
    private Escolaridade escolaridade;

    Pessoa(String nome)
    {
        setNome(nome);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty())
        {
            throw new IllegalArgumentException("O nome não pode estar vazio!");
        }
        this.nome = nome;
    }
}
