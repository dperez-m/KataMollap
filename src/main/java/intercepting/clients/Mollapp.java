package intercepting.clients;

public class Mollapp implements Client{
    private ProgramadorTasques programadorTasques = null;

    public Mollapp() {
    }

    @Override
    public void setProgramadorTasques(ProgramadorTasques programadorTasques) {
        this.programadorTasques = programadorTasques;
    }

    @Override
    public void enviarPeticio(String str) {
        programadorTasques.executarTasques(str);
    }
}
