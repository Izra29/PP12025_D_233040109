package tugas1;

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
	



