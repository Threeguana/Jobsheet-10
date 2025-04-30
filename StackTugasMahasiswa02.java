public class StackTugasMahasiswa02 {
    Mahasiswa02[] stack;
    int top, size;

    public StackTugasMahasiswa02(int size) {
        this.size = size;
        stack = new Mahasiswa02[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa02 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh!"); 
            // tidak dpt menambahkan tugas lagi
        }
    }

    public Mahasiswa02 pop() {
        if (!isEmpty()) {
            Mahasiswa02 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong!");
            // tidak ada tugas utk dinilai
            return null;
        }
    }

    public Mahasiswa02 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            // tidak ada tugas utk dikumpulkan
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
    // modif praktikum 1
    public Mahasiswa02 low() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public int jmlTugas() {
        return top + 1;
    }

    // praktikum 2
    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi02 stack = new StackKonversi02();
        while (nilai != 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}