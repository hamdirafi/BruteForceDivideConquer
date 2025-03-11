public class Sum {
    public int[] data;

    public Sum(int[] data) {
        this.data = data;
    }

    public int totalBF() {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }

    public int totalDC(int left, int right) {
        if (left == right) {
            return data[left];
        }
        int mid = (left + right) / 2;
        return totalDC(left, mid) + totalDC(mid + 1, right);
    }
}
