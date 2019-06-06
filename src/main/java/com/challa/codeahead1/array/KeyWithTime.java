package com.challa.codeahead1.array;

import java.sql.Timestamp;

public class KeyWithTime implements Comparable<KeyWithTime>


{String key ;
Timestamp time;
public KeyWithTime(String key, Timestamp time){
    this.key=key;
    this.time=time;
}
/* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((key == null) ? 0 : key.hashCode());
    result = prime * result + ((time == null) ? 0 : time.hashCode());
    return result;
}
/* (non-Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 */
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    KeyWithTime other = (KeyWithTime) obj;
    if (key == null) {
        if (other.key != null)
            return false;
    } else if (!key.equals(other.key))
        return false;
    if (time == null) {
        if (other.time != null)
            return false;
    } else if (!time.equals(other.time))
        return false;
    return true;
}
public int compareTo(KeyWithTime o) {
	// TODO Auto-generated method stub
	return 0;
}

}
