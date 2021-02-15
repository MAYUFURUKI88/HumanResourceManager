//package com.rapideact.local.humanresource.services;
//
//
//import java.util.Collection;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.rapideact.local.humanresource.Account;
//import com.rapideact.local.humanresource.DbUserDetails;
//import com.rapideact.local.humanresource.mybatis.mapper.LoginMapper;
//
//@Service
//public class DbUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    LoginMapper loginMapper;
//
//    @Override
//    @Transactional(readOnly = true)
//    public UserDetails loadUserByUsername(String name)
//            throws UsernameNotFoundException {
//        // DBからユーザ情報を取得。
//        Account account = loginMapper.findAccount(name);
//        return new DbUserDetails(account, getAuthorities(account));
//    }
//
//    /**
//     * 認証が通った時にこのユーザに与える権限の範囲を設定する。
//     * @param account DBから取得したユーザ情報。
//     * @return 権限の範囲のリスト。
//     */
//    private Collection<GrantedAuthority> getAuthorities(Account account) {
//        // 認証が通った時にユーザに与える権限の範囲を設定する。
//    	// TODO:権限の付与方法については総務と要相談(DBにフラグを持たせるかJavaで固定にするか)
//    	switch (account.getName()) {
//    	    case "admin":
//    	    case "rapideact":
//    	    	return AuthorityUtils.createAuthorityList("ROLE_ALL");
//    	    default:
//    	    	return AuthorityUtils.createAuthorityList("ROLE_LIMIT");
//    	}
//    }
//
//}