/**
* @Copyright (c) 成都大学信息科学与技术学院
* 服务外包与创意大赛
*/
package cn.cdu.edu.TQC.bems.db.dao;

import java.util.List;

import cn.cdu.edu.TQC.bems.db.bean.PhoneFeeData;

/**
 * @ClassName: PhoneFeeDataDao
 * 说明：
 * TODO(Tell the reader such role.)
 * @Author SUN	【email:1096490965@qq.com】
 * @Version V1.0	2012-7-8 下午8:16:20
 *
 */
public interface PhoneFeeDataDao {
	
	public boolean addPhoneFeeData(PhoneFeeData phoneFeeData);
	
	public boolean updatePhoneFeeData(PhoneFeeData phoneFeeData);
	
	public PhoneFeeData getPhoneFeeDataById(Integer phoneFeeDataid);
	
	public List<PhoneFeeData> getPhoneFeeDatas();
	
	public List<PhoneFeeData> getPhoneFeeDatasByPid(Integer pid);
	
	public List<PhoneFeeData> getPhoneFeeDatas(int year,int month);

}
