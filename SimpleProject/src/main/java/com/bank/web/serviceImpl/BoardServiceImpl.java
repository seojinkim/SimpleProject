package com.bank.web.serviceImpl;

import org.springframework.stereotype.Service;

import com.bank.web.domain.BoardVO;
import com.bank.web.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {

	@Override
	public BoardVO[] selectBoard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertBoard(String id, String title, String context) {
		// TODO Auto-generated method stub
		return 0;
	}
	/*AccountVO account = new AccountVO();
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public String deposit(int money) {
		// 2. 입금
		account.setMoney(account.getMoney() + money);
		return "잔액 : " + account.getMoney();
	}
	
	@Override
	public String withdraw(int money) {
		// 3. 출금  ALT + SHIFT + M : 메소드로 추출하는 단축키
		return (account.getMoney() >= money) ? this.saveMoney(money) : "잔액 부족";
	}
	
	private String saveMoney(int money) {
		String result;
		account.setMoney(account.getMoney() - money);
		result = "잔액 : " + account.getMoney();
		return result;
	}
	
	@Override
	public String search() {
		// 4. 잔액조회
		return "잔액 : " + account.getMoney();
	}
	
	@Override
	public AccountVO getAccount(String userid) {
		AccountVO temp = new AccountVO();
		AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
		temp = mapper.selectAccount(userid);
		return temp;
	}*/
}
