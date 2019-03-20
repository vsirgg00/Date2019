package es.unileon.prg.date;

public class Date {

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) throws DateException{
		this.year = year;
		if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido" +
					" Valores posibles entre 1 y 12.");
		} else {
			this.month = month;
		}
		//TODO falta comprobar el dia
		this.day = day;
		if (month==2) {
			if (year.bisiesto()==true) {
				if ((day<1)||(day>29)) {
					throw new DateException("Día " +day+ " no válido" + " Valores posibles entre 1 y 29.");
				}
				else {
					this.day = day;
				}
			}
			else {
				if ((day<1)||(day>28)) {
					throw new DateException("Día " +day+ " no válido" + " Valores posibles entre 1 y 28.");
				}
				else {
					this.day = day;
				}				
			}
		}
		else if ((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12)) {
			if ((day<1)||(day>31)) {
				throw new DateException("Día " +day+ " no válido" + " Valores posibles entre 1 y 31.");
			}
			else {
				this.day = day;
			}			
		}
		else {
			if ((day<1)||(day>30)) {
				throw new DateException("Día " +day+ " no válido" + " Valores posibles entre 1 y 30.");
			}
			else {
				this.day = day;
			}
		}
	}
	


	public boolean isSameYear(int y) {
		boolean iSY=false;
		if (year==y) {
			iSY=true;
		}
		return iSY;
	}
	
	public boolean isSameMonth(int m) {
		boolean iSM=false;
		if (month==m) {
			iSM=true;
		}
		return iSM;
	}

	public boolean isSameDay(int d) {
		boolean iSD=false;
		if (day==d) {
			iSD=true;
		}
		return iSD;
	}

/*	public boolean isSame(int d, int m, int y) {
		boolean iS=false;
		if ((y.iSameYear(year)==true)&&(iSameMonth(month)==true)&&(iSameDay(day)==true)) {
			iS=true;
		}
		return iS;
	}
*/
	public void nameMonth() {
		switch(month) {
			case 1:
				System.out.println("Enero");
				break;
			case 2:
				System.out.println("Febrero");
				break;
			case 3:
				System.out.println("Marzo");
				break;
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Mayo");
				break;
			case 6:
				System.out.println("Junio");
				break;
			case 7:
				System.out.println("Julio");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 9:
				System.out.println("Septiembre");
				break;
			case 10:
				System.out.println("Octubre");
				break;
			case 11:
				System.out.println("Noviembre");
				break;
			case 12:
				System.out.println("Diciembre");
				break;
			default
				System.out.println("Enero");
		}
	}

	public void checkDay(int d, int m, int y) {
		if (m==2) {
			if (y.bisiesto()==true) {
				if ((d<1)||(d>29)) {
					System.out.println("Día " +d+ " no válido" + " Valores posibles entre 1 y 29.");
				}
				else {
					System.out.println("Día " +d+ " válido");
				}
			}
			else {
				if ((d<1)||(d>28)) {
					System.out.println("Día " +d+ " no válido" + " Valores posibles entre 1 y 28.");
				}
				else {
					System.out.println("Día " +d+ " válido");
				}				
			}
		}
		else if ((m==1)||(m==3)||(m==5)||(m==7)||(m==8)||(m==10)||(m==12)) {
			if ((d<1)||(d>31)) {
				System.out.println("Día " +d+ " no válido" + " Valores posibles entre 1 y 31.");
			}
			else {
				System.out.println("Día " +d+ " válido");
			}			
		}
		else {
			if ((d<1)||(d>30)) {
				System.out.println("Día " +d+ " no válido" + " Valores posibles entre 1 y 30.");
			}
			else {
				System.out.println("Día " +d+ " válido");
			}
		}		
	}

	public v

	public boolean bisiesto() {
		boolean bis=false;
		if((year%400==0)||((year%4==0)&(year%100!=0))) {
			bis=true;
		}
		return bis;
	}

	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

}

