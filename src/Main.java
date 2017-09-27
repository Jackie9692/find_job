import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<UnilateralLine> lineList = new ArrayList<UnilateralLine>();
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if (line.trim() == "")
				break;// 空行 退出循环
			String[] options = line.split(";");
			if (options.length < 5) {
				break;
			}
			lineList.add(new UnilateralLine(options[0], options[1], options[2],
					options[3], options[4], options[5]));
		}
		scanner.close();

		// wirte your code here
		// List<String> result = calculateUnilateral(lineList);

		for (UnilateralLine item : lineList) {
			System.out.println(item.id);
		}

		// for (String str : result) {
		// System.out.println(str);
		// }
	}

	public static List<String> calculateUnilateral(List<UnilateralLine> lineList) {
		List<String> result = new ArrayList<String>();

		int originalSize = lineList.size();// 初始化
		int count = originalSize;
		int i = 0;
		List<UnilateralLine> currentList = new ArrayList<Main.UnilateralLine>();
		for (UnilateralLine item : lineList) {
			currentList.add(item);
		}

		while (i < originalSize) {
			UnilateralLine current = lineList.get(i);
			String cscenter = current.getSCen();
			String cspro = current.getSPro();
			String cecenter= current.getECen();
			String cepro = current.getEPro();
			String ctype = current.getTType();
			
			String eachResult = "";

			int j = i + 1;
			for (; j < currentList.size(); j++) {
				UnilateralLine tempItem = currentList.get(j);
				// rule1
				if (tempItem.getECen().equals(cscenter)
						&& tempItem.getEPro().equals(cepro)
						&& tempItem.getECen().equals(cscenter)
						&& tempItem.getEPro().equals(cspro)) {
					if(tempItem.getTType().equals(ctype)){
//						rule1:350410+350424
						eachResult = "rule1:" + tempItem.getId() + "+" + current.getId();
						
						currentList.remove(current);
						currentList.add(new UnilateralLine(eachResult, eachResult, eachResult, eachResult, eachResult, eachResult));
						result.add(eachResult);
						continue;
					}
				}
				// rule2
				// rule3

			}

			i++;
		}

		return result;
	}

	public static class UnilateralLine {
		private String id;
		private String sCen;// 出发分拨
		private String sPro;// 出发省
		private String eCen;// 到达分拨
		private String ePro;// 到达省
		// 9.6m/17.5m
		private String tType;// 车型

		public UnilateralLine(String id, String sCen, String sPro, String eCen,
				String ePro, String tType) {
			this.id = id;
			this.sCen = sCen;
			this.sPro = sPro;
			this.eCen = eCen;
			this.ePro = ePro;
			this.tType = tType;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getSCen() {
			return sCen;
		}

		public void setSCen(String ePro) {
			this.ePro = ePro;
		}

		public String getSPro() {
			return sPro;
		}

		public void setSPro(String sPro) {
			this.sPro = sPro;
		}

		public String getECen() {
			return eCen;
		}

		public void setECen(String eCen) {
			this.eCen = eCen;
		}

		public String getEPro() {
			return ePro;
		}

		public void setEPro(String ePro) {
			this.ePro = ePro;
		}

		public String getTType() {
			return tType;
		}

		public void setTType(String tType) {
			this.tType = tType;
		}
	}
}