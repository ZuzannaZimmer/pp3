public class Numbers implements Ok {
    private int[] arr;

    public Numbers(int[] arr) {
        this.arr = arr;
    }

    @Override
    public boolean ok() {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                if (arr[i] % 2 == 0) {
                } else {
                    return false;
                }
            }
            if (i % 2 != 0) {
                if (arr[i] % 2 != 0) {
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
