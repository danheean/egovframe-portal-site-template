package egovframework.let.uss.olp.qrm.service.impl;

import java.util.List;

import org.egovframe.rte.fdl.cmmn.EgovAbstractServiceImpl;
import org.egovframe.rte.fdl.idgnr.EgovIdGnrService;
import org.springframework.stereotype.Service;

import egovframework.com.cmm.ComDefaultVO;
import egovframework.let.uss.olp.qrm.service.EgovQustnrRespondManageService;
import egovframework.let.uss.olp.qrm.service.QustnrRespondManageVO;
import lombok.RequiredArgsConstructor;

/**
 * 설문응답자관리 ServiceImpl Class 구현
 * 
 * @author 공통서비스 장동한
 * @since 2009.03.20
 * @version 1.0
 * @see
 *
 *      <pre>
 * << 개정이력(Modification Information) >>
 *
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *   2009.03.20  장동한          최초 생성
 *   2011.08.31  JJY           경량환경 템플릿 커스터마이징버전 생성
 *   2024.09.26  이백행          컨트리뷰션 롬복 생성자 기반 종속성 주입
 *
 *      </pre>
 */
@Service
@RequiredArgsConstructor
public class EgovQustnrRespondManageServiceImpl extends EgovAbstractServiceImpl
		implements EgovQustnrRespondManageService {

	private final QustnrRespondManageDao dao;

	private final EgovIdGnrService qustnrRespondManageIdGnrService;

	/**
	 * 응답자정보 목록을 조회한다.
	 * 
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return List
	 * @throws Exception
	 */
	@Override
	public List<?> selectQustnrRespondManageList(ComDefaultVO searchVO) throws Exception {
		return dao.selectQustnrRespondManageList(searchVO);
	}

	/**
	 * 응답자정보를(을) 상세조회 한다.
	 * 
	 * @param QustnrRespondManage - 회정정보가 담김 VO
	 * @return List
	 * @throws Exception
	 */
	@Override
	public List<?> selectQustnrRespondManageDetail(QustnrRespondManageVO qustnrRespondManageVO) throws Exception {
		return dao.selectQustnrRespondManageDetail(qustnrRespondManageVO);
	}

	/**
	 * 응답자정보를(을) 목록 전체 건수를(을) 조회한다.
	 * 
	 * @param searchVO - 조회할 정보가 담긴 VO
	 * @return int
	 * @throws Exception
	 */
	@Override
	public int selectQustnrRespondManageListCnt(ComDefaultVO searchVO) throws Exception {
		return dao.selectQustnrRespondManageListCnt(searchVO);
	}

	/**
	 * 응답자정보를(을) 등록한다.
	 * 
	 * @param qustnrRespondManageVO - 응답자정보 정보가 담긴 VO
	 * @throws Exception
	 */
	@Override
	public void insertQustnrRespondManage(QustnrRespondManageVO qustnrRespondManageVO) throws Exception {
		String sMakeId = qustnrRespondManageIdGnrService.getNextStringId();

		qustnrRespondManageVO.setQestnrRespondId(sMakeId);

		dao.insertQustnrRespondManage(qustnrRespondManageVO);
	}

	/**
	 * 응답자정보를(을) 수정한다.
	 * 
	 * @param qustnrRespondManageVO - 응답자정보 조회할 정보가 담긴 VO
	 * @throws Exception
	 */
	@Override
	public void updateQustnrRespondManage(QustnrRespondManageVO qustnrRespondManageVO) throws Exception {
		dao.updateQustnrRespondManage(qustnrRespondManageVO);
	}

	/**
	 * 응답자정보를(을) 삭제한다.
	 * 
	 * @param qustnrRespondManageVO - 응답자정보 정보가 담긴 VO
	 * @return
	 * @throws Exception
	 */
	@Override
	public void deleteQustnrRespondManage(QustnrRespondManageVO qustnrRespondManageVO) throws Exception {
		dao.deleteQustnrRespondManage(qustnrRespondManageVO);
	}
}
