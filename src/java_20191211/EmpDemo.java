package java_20191211;

import java.util.ArrayList;

import java_20191210.dto.DeptDto;
import java_20191211.dao.EmpDao;
import java_20191211.dto.EmpDto;

public class EmpDemo {
	public static void main(String[] args) {
		EmpDao dao = EmpDao.getInstance();
//		dao.insert(new EmpDto(9000,"GIL","RANDD",7839,null,4999,0,10));
//		dao.update(new EmpDto(9000,"GILMIN","MASTER",7839,null,5000,10,30));
//		dao.delete(9000);
		
		
//		ArrayList<EmpDto> list = dao.select(0,5);
//		for (EmpDto dto : list) {
//			int no = dto.getNo();
//			String name = dto.getName();
//			String job = dto.getJob();
//			int mgr = dto.getMgr();
//			String hiredate = dto.getHiredate();
//			double sal = dto.getSal();
//			double comm = dto.getComm();
//			int deptNo = dto.getDeptNo();
//			System.out.printf("%d, %s, %s, %d, %s, %.2f, %.2f, %d\n",
//					no,name,job,mgr,hiredate,sal,comm,deptNo);
//		}
		
		EmpDto dto = dao.select(7369);
		if(dao == null){
			System.out.println("NOT Exist data");
		}else{
			int no = dto.getNo();
			String name = dto.getName();
			String job = dto.getJob();
			int mgr = dto.getMgr();
			String hiredate = dto.getHiredate();
			double sal = dto.getSal();
			double comm = dto.getComm();
			int deptNo = dto.getDeptNo();
			System.out.printf("%d, %s, %s, %d, %s, %.2f, %.2f, %d\n",
					no,name,job,mgr,hiredate,sal,comm,deptNo);
		}
		
		
		
	}
}
