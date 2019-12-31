class Data {
    Object val;

    <T> Data(T val) {
        this.val = val; // Line 1
    }

    <U> U getVal() {
        return (U) val; // Line 2
    }
}

class Test1 {
    public static void main(String[] args) {
        Data d = new Data(1); // Line 3
        String s = d.getVal(); // Line 4
        System.out.println(s);
    }
}
