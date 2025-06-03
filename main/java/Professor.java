public class Professor extends Pessoa{

    Professor(String nome, Escolaridade escolaridade)
    {
        super(nome);
        setEscolaridade(escolaridade);
    }

    public String getNomeGraduacao()
    {
        if (getEscolaridade() == null) {
            throw new IllegalStateException("O professor deve ter uma escolaridade!");
        }
        return getEscolaridade().getPosGraduacao();
    }
}
