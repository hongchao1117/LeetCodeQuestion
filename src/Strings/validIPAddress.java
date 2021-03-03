package Strings;

public class validIPAddress {
    public String validIPAddress(String IP) {
        String[] ipv4 = IP.split("\\.");
        String[] ipv6 = IP.split(":");
        if (ipv4.length == 4 && IP.charAt(0) != '.' && IP.charAt(IP.length() - 1) != '.') {
            for (String s : ipv4) {
                if (s.length() == 0 || s.length() >= 4
                        || s.charAt(0) == '0' && s.length() > 1) return "Neither";
                int num = 0;
                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);
                    if (ch < '0' || ch > '9') return "Neither";
                    num = num * 10 + ch - '0';
                }
                if (num >= 256) return "Neither";
            }
            return "IPv4";
        }
        if (ipv6.length == 8 && IP.length() >= 15 && IP.charAt(0) != ':'
                && IP.charAt(IP.length() - 1) != ':') {
            for (String s : ipv6) {
                if (s.length() == 0 || s.length() > 4) return "Neither";
                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);
                    if (!(ch >= '0'  && ch <= '9' || ch >= 'A' && ch <= 'F'
                            || ch >= 'a' && ch <= 'f')) return "Neither";
                }
            }
            return "IPv6";
        }
        return "Neither";
    }
}
