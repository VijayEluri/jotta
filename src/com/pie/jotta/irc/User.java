package com.pie.jotta.irc;

/*
 *  This file is part of Jotta.
 *
 *  Jotta is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Jotta is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Jotta.  If not, see <http://www.gnu.org/licenses/>.
 */

public class User {

	private String user;
	private int access;
	
	public User(String user, int access) {
		this.user = access > 0 ? user.substring(1) : user;
		this.access = access;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String newUser) {
		this.user = newUser;
	}
	
	public int getAccess() {
		return access;
	}
	
	public void setAccess(int newAccess) {
		this.access = newAccess;
	}
	
}
