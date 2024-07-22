public class Container {

    private int state;

    public Container() {
        state = 0;
    }

    public int contains() {
        return state;
    }

    public void add(int amount) {
        if (amount > 0) {
            state = Math.min(state + amount, 100);
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            state = Math.max(state - amount, 0);
        }
    }

    @Override
    public String toString() {
        return state + "/100";
    }
}
