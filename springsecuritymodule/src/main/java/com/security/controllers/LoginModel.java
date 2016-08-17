package com.security.controllers;



public class LoginModel
{
		private String username;

		private String password;
		
		private String fiscalYear;
		
		private String payingOffice;
		

		public String getFiscalYear() {
			return fiscalYear;
		}

		public void setFiscalYear(String fiscalYear) {
			this.fiscalYear = fiscalYear;
		}

		public String getPayingOffice() {
			return payingOffice;
		}

		public void setPayingOffice(String payingOffice) {
			this.payingOffice = payingOffice;
		}

		public String getPassword()
		{
				return this.password;
		}

		public String getUsername()
		{
				return this.username;
		}

		public void setUsername(String username)
		{
				this.username = username;
		}

		public void setPassword(String password)
		{
				this.password = password;
		}


}
