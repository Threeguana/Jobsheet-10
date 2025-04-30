public class StackSurat02 {
    Surat02[] data;
    int top, size;

    public StackSurat02(int size) {
        this.size = size;
        data = new Surat02[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat02 s) {
        if (!isFull()) {
            data[++top] = s;
        } else {
            System.out.println("Stack penuh. Tidak bisa menambah surat baru.");
        }
    }

    public Surat02 pop() {
        if (!isEmpty()) {
            return data[top--];
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat02 peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Tidak ada surat.");
            return null;
        }
    }

    public boolean cariSurat(String nama) {
        for (int i = top; i >= 0; i--) {
            if (data[i].NamaMhs().equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }
}
