public class Nilai {
    public static int maxUTS(int[] uts, int left, int right) {
        if (left == right) return uts[left];
        int mid = (left + right) / 2;
        int leftMax = maxUTS(uts, left, mid);
        int rightMax = maxUTS(uts, mid + 1, right);
        return Math.max(leftMax, rightMax);
    }

    public static int minUTS(int[] uts, int left, int right) {
        if (left == right) return uts[left];
        int mid = (left + right) / 2;
        int leftMin = minUTS(uts, left, mid);
        int rightMin = minUTS(uts, mid + 1, right);
        return Math.min(leftMin, rightMin);
    }

    public static double avgUAS(int[] uas) {
        int sum = 0;
        for (int nilai : uas) sum += nilai;
        return (double) sum / uas.length;
    }
}
