package com.pro.wings.creational.builder;

public class User {
	
	 String firstName; // required
	 String lastName; // required
	 int age; // optional
	 String phone; // optional
	 String address; // optional

	 public User(UserBuilder builder) {
			this.firstName = builder.firstName;
			this.lastName = builder.lastName;
			this.age = builder.age;
			this.phone = builder.phone;
			this.address = builder.address;
		}


	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	 
	public static class UserBuilder {
		
		 String firstName; // required
		 String lastName; // required
		 int age; // optional
		 String phone; // optional
		 String address; // optional
		 
		 public UserBuilder(String firstName, String lastName) {
				this.firstName = firstName;
				this.lastName = lastName;
			}
		 
		 public UserBuilder setAge(int age) {
				this.age = age;
				return this;
			}

		 public UserBuilder setPhone(String phone) {
				this.phone = phone;
				return this;
			}
			public UserBuilder setAddress(String address) {
				this.address = address;
				return this;
			}
			
			//Return the finally constructed User object
			public User build() {
				User user =  new User(this);
				return user;
			}

	}
 
	 
	 
}
