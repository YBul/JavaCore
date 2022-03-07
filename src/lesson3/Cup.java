package lesson3;

// T, S, U, V и так далее - тип данных
// K - key
// V -value
// E - element
// N - зарезервировано

public class Cup <T extends Liquid>{
    private T liquid;

    public Cup(T liquid) {
        this.liquid = liquid;
    }

    public T getLiquid() {
        return liquid;
    }

    public void compareLiquids(Cup<?> another) {

    }
}
