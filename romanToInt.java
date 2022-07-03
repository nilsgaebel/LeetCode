class Solution {
    public static int romanToInt(String s) {
        int res = 0;
        char cur = ' ';
        char last = ' ';
        for (int i = 0; i < s.length(); i++) {
            cur = s.charAt(i);
            switch (cur) {
                case 'I':
                    res += 1;
                    break;
                case 'V':
                    if (last == 'I') {
                        res += 3;
                    } else {
                        res += 5;
                    }
                    break;
                case 'X':
                    if (last == 'I') {
                        res += 8;
                    } else {
                        res += 10;
                    }
                    break;
                case 'L':
                    if (last == 'X') {
                        res += 30;
                    } else {
                        res += 50;
                    }
                    break;
                case 'C':
                    if (last == 'X') {
                        res += 80;
                    } else {
                        res += 100;
                    }
                    break;
                case 'D':
                    if (last == 'C') {
                        res += 300;
                    } else {
                        res += 500;
                    }
                    break;
                case 'M':
                    if (last == 'C') {
                        res += 800;
                    } else {
                        res += 1000;
                    }
                    break;
                default:
                    System.out.println("Invalid input value");
                    break;
            }
            last = cur;
        }
        return res;
    }
}