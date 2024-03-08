package intercepting.administrador;

public class ProgramadorTasques {
        private Tasques tasques = null;

    public ProgramadorTasques(Target target) {
        tasques.setTarget(target);
    }

    public Tasques getTasques() {
        return tasques;
    }

    public void setTasca(Filtre filtre){
        tasques.afegirTasca(filtre);
    }

    public void executarTasques(String str){
        tasques.execucio(str);
    }
}
