import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Q = sc.nextInt();
		sc.nextLine();
		Map<String, String> extensionToMedia = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String line = sc.nextLine();
			int spaceIndex = line.indexOf(' ');
			String extension = line.substring(0, spaceIndex);
			String media = line.substring(spaceIndex + 1);

			extensionToMedia.put(extension, media);
		}
		for (int i = 0; i < Q; i++) {
			String fileName = sc.next();

			System.out.println(solve(extensionToMedia, fileName));
		}

		sc.close();
	}

	static String solve(Map<String, String> extensionToMedia, String fileName) {
		return extensionToMedia.getOrDefault(getExtension(fileName), "unknown");
	}

	static String getExtension(String fileName) {
		int lastDotIndex = fileName.lastIndexOf('.');
		return (lastDotIndex == -1) ? null : fileName.substring(lastDotIndex + 1);
	}
}
