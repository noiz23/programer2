import java.io.*;

class Data implements Externalizable {
    int val;

    Data(int val) {
        this.val = val;
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(val);
    }

    public void readExternal(ObjectInput in) throws IOException {
        val += in.readInt();
    }
}

class Test3 {
    public static void main(String[] args) throws Exception {
        File file = new File("o.ser");
        Data in = new Data(1);
        var oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(in);

        var ois = new ObjectInputStream(new FileInputStream(file));
        Data out = (Data) ois.readObject();
        System.out.println(out.val);
    }
}
