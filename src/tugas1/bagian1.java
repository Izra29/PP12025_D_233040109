package tugas1;

public class bagian1 {
	public class Node {
	
		//inisialisasi Node
		public Node(int nilai) {
			this.nilai = nilai;
		}
		public int getNilai() {
			return nilai;
		}

		public void setNilai(int nilai) {
			this.nilai = nilai;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		private int nilai;
		private Node next;
	}
	public class Nodemain {
		public static void main (String[] args) {
			
			//membuat 2 buah node n1 & n2
			Node n1 = new Node(5);
			Node n2 = new Node(7);
			
			//membuat relasi Node n1 & n2
			n1.setNext(n2);
			
			//menampilkan Node n1 & n2 dengan pointer p
			Node p = n1;
			while(p !=null)
			{
				System.out.printf("%d ", p.getNilai());
				p = p.getNext();
			}
		}
	}
}


