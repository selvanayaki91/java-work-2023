package com.sb.basic.pattern;

public class Yongster {
	public static void main(String[] args) {
		Yongster yy= new Yongster();
		Theatre ticket = new Theatre();
		yy.go_to_movie(ticket);
		
	}

	private void go_to_movie(Theatre ticket) {
		// TODO Auto-generated method stub
		System.out.println("Entered Theatre");
		ticket.show_Ticket();
	}

}
