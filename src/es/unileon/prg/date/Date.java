package es.unileon.prg.date;

public class Date {

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) throws DateException{
		this.year = year;
		if (checkMonth(month)==false) {
			throw new DateException("Mes " + month + " no valido" +
					" Valores posibles entre 1 y 12.");
		} else {
			this.month = month;
		}
		//TODO falta comprobar el dia
		if (checkDay(year, month, day)==false) {
			throw new DateException("Día " +day+ " no válido");
		}
		else {
			this.day = day;
		}
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setDay(int y, int m, int d) throws DateException{
		if (checkDay(y, m ,d)==false) {
			throw new DateException("Día " +d+ " no válido");
		}
		else {
			this.day=d;
		}
	}
	
	public void setMonth(int m) throws DateException{
		if (checkMonth(m)==false) {
			throw new DateException("Día " +m+ " no válido");
		}
		else {
			this.month=m;
		}
	}
	
	public void setYear(int y) {
			this.year=y;
	}

	public boolean isSameYear(Date anotherDate) {
		boolean iSY=false;
		if (this.year==anotherDate.getYear()) {
			iSY=true;
		}
		return iSY;
	}
	
	public boolean isSameMonth(Date anotherDate) {
		boolean iSM=false;
		if (this.month==anotherDate.getMonth()) {
			iSM=true;
		}
		return iSM;
	}

	public boolean isSameDay(Date anotherDate) {
		boolean iSD=false;
		if (this.day==anotherDate.getDay()) {
			iSD=true;
		}
		return iSD;
	}

	public boolean isSame(Date anotherDate) {
		boolean iS=false;
		if ((isSameYear(anotherDate)==true)&&(isSameMonth(anotherDate)==true)&&(isSameDay(anotherDate)==true)) {
			iS=true;
		}
		return iS;
	}
	
	public boolean isSameYearV2(Date anotherDate) {
		return this.year==anotherDate.getYear();
	}
	
	public boolean isSameMonthV2(Date anotherDate) {
		return this.month==anotherDate.getMonth();
	}

	public boolean isSameDayV2(Date anotherDate) {
		return this.day==anotherDate.getDay();
	}

	public boolean isSameV2(Date anotherDate) {
		return (isSameYear(anotherDate)==true)&&(isSameMonth(anotherDate)==true)&&(isSameDay(anotherDate)==true);
	}

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
			default:
				System.out.println("Enero");
		}
	}

	public void Season() {
		switch(month) {
		case 1:
		case 2:
		case 3:
			System.out.println("Invierno");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("Primavera");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("Verano");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("Otonyo");
			break;
		default:
			System.out.println("Invierno");
		}
	}
	
	public void MonthsUntilYearEnd() {
		switch(month) {
		case 1:
			System.out.println("Enero");
		case 2:
			System.out.println("Febrero");
		case 3:
			System.out.println("Marzo");
		case 4:
			System.out.println("Abril");
		case 5:
			System.out.println("Mayo");
		case 6:
			System.out.println("Junio");
		case 7:
			System.out.println("Julio");
		case 8:
			System.out.println("Agosto");
		case 9:
			System.out.println("Septiembre");
		case 10:
			System.out.println("Octubre");
		case 11:
			System.out.println("Noviembre");
		case 12:
			System.out.println("Diciembre");
			break;
		default:
			System.out.println("Enero");
		}
	}
	
	public boolean checkMonth(int m) {
		boolean check=false;
		if (m < 1 || m > 12) {
			check=false;
		} else {
			check=true;
		}
		return check;
	}
	
	public boolean checkDay(int y, int m, int d) {
		boolean check=false;
		if (m==2) {
			if (bisiesto(y)==true) {
				if ((d<1)||(d>29)) {
					check=false;
				}
				else {
					check=true;		
					}
			}
			else {
				if ((d<1)||(d>28)) {
					check=false;
					}
				else {
					check=true;
					}				
			}
		}
		else if ((m==1)||(m==3)||(m==5)||(m==7)||(m==8)||(m==10)||(m==12)) {
			if ((d<1)||(d>31)) {
				check=false;
				}
			else {
				check=true;
				}			
		}
		else {
			if ((d<1)||(d>30)) {
				check=false;
				}
			else {
				check=true;
				}
		}	
		return check;
	}

	public boolean bisiesto(int y) {
		boolean bis=false;
		if((y%400==0)||((y%4==0)&(y%100!=0))) {
			bis=true;
		}
		return bis;
	}

	public void printDate() {
		System.out.println(+day+"/"+month+"/"+year);
	}
	
	public void printDateUntilMonthEnd() throws DateException{
		int i;
		switch (month) {
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			for (i=day;i<=31;i++) {
				setDay(year,month,i);
				printDate();
			}
			break;
		case 2:
			if (bisiesto(year)==false) {
				for (i=day;i<=28;i++) {
				setDay(year,month,i);
				printDate();
				}
			}
			else {
				for (i=day;i<=29;i++) {
				setDay(year,month,i);
				printDate();
				}
			}
			break;
		default:
			for (i=day;i<=30;i++) {
				setDay(year,month,i);
				printDate();
			}
		}
	}
	
	public void MonthsWhithSameDays() {
		switch (month) {
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Enero, marzo, mayo, julio, agosto, octubre, diciembre.");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		default:
			System.out.println("Abril, junio, septiembre, noviembre");
		}	
	}
	
	public int numberDaysOfYear() {
		int days=0;
		switch (month) {
		case 1:
			days=0+day;
			break;
		case 2:
			days=31+day;
			break;
		case 3:
			days=31+28+day;
			break;
		case 4:
			days=31+28+31+day;
			break;
		case 5:
			days=31+28+31+30+day;
			break;
		case 6:
			days=31+28+31+30+31+day;
			break;
		case 7:
			days=31+28+31+30+31+30+day;
			break;
		case 8:
			days=31+28+31+30+31+30+31+day;
			break;
		case 9:
			days=31+28+31+30+31+30+31+31+day;
			break;
		case 10:
			days=31+28+31+30+31+30+31+31+30+day;
			break;
		case 11:
			days=31+28+31+30+31+30+31+31+30+31+day;
			break;
		case 12:
			days=31+28+31+30+31+30+31+31+30+31+30+day;
			break;
		default:
			days=0;
		}
		return days;
	}
	
	public int attempsToRGenerate() throws DateException{
		int y, m, d, attemps;
		boolean stop=false;
		attemps=0;
		while (stop==false) {
			attemps=attemps+1;
			d=(int) (Math.random()*31+1);
			m=(int) (Math.random()*12+1);
			y=(int) (Math.random()*2020+2000);
			Date random;
			random = new Date(d,m,y);
			if ((isSameMonth(random)==true)&&(isSameDay(random)==true)) {
				stop=true;
			}
		}
		return attemps;
	}
	
	public int attempsToRGenerateV2() throws DateException{
		int y, m, d, attemps;
		boolean stop=false;
		attemps=0;
		do {
			attemps=attemps+1;
			d=(int) (Math.random()*31+1);
			m=(int) (Math.random()*12+1);
			y=(int) (Math.random()*2020+2000);
			Date random;
			random = new Date(d,m,y);
			if ((isSameMonth(random)==true)&&(isSameDay(random)==true)) {
				stop=true;
			}
		}while (stop==false);
		return attemps;
	}
	
	public void dayOfTheWeek(String nombredia1) {
		int nombre;
		nombre=((numberDaysOfYear())%7)-1;
		switch (nombredia1) {
		case "Lunes":
			nombre=nombre+0;
			break;
		case "Martes":
			nombre=nombre+1;
			break;
		case "Miercoles":
			nombre=nombre+2;
			break;
		case "Jueves":
			nombre=nombre+3;
			break;
		case "Viernes":
			nombre=nombre+4;
			break;
		case "Sabado":
			nombre=nombre+5;
			break;
		default:
			nombre=nombre+6;
		}
		
		if (nombre>6) {
			nombre=nombre-7;
		}
		
		switch (nombre) {
		case 0:
			System.out.println("Lunes");
			break;
		case 1:
			System.out.println("Martes");
			break;
		case 2:
			System.out.println("Miercoles");
			break;
		case 3:
			System.out.println("Jueves");
			break;
		case 4:
			System.out.println("Viernes");
			break;
		case 5:
			System.out.println("Sabado");
			break;
		case 6:
			System.out.println("Domingo");
			break;
		}
		
	}
	
	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

}

