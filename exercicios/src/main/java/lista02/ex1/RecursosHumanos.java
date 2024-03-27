package school.sptech.ex1;

public class RecursosHumanos {

    private Integer totalPromovidos;
    private Integer totalReajustados;

    public RecursosHumanos(Integer totalPromovidos, Integer totalReajustados) {
        this.totalPromovidos = totalPromovidos;
        this.totalReajustados = totalReajustados;
    }

    public RecursosHumanos() {
        this(0,0);
    }

    public void reajustarSalario(Colaborador colaborador, Double percentualReajuste) {
        Double novoSalario = colaborador.getSalario() * (1 + percentualReajuste / 100);
        colaborador.setSalario(novoSalario);
        totalReajustados++;
    }

    public void promover(Colaborador colaborador, String novoCargo, Double novoSalario){
        if (novoSalario< colaborador.getSalario()){
            System.out.println("O salario novo é menor que o salario atual");
            return;
        }

        colaborador.setCargo(novoCargo);
        colaborador.setSalario(novoSalario);
        totalPromovidos++;
    }

    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public Integer getTotalReajustados() {
        return totalReajustados;
    }
}
