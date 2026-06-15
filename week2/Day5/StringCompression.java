
public class StringCompression {

    public static int compress(char[] chars) {
        int read = 0;
        int write = 0;

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            // Count consecutive characters
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            // Write the character
            chars[write] = currentChar;
            write++;

            // Write the count if greater than 1
            if (count > 1) {
                String num = String.valueOf(count);

                for (char c : num.toCharArray()) {
                    chars[write] = c;
                    write++;
                }
            }
        }

        return write;
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        int length = compress(chars);

        System.out.println("Compressed Length: " + length);

        System.out.print("Compressed Array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}