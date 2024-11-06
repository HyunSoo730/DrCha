# 🏦 차용박사 - AI 기반 P2P 대출 중개 플랫폼

<div align="center">
<img width="1000" alt="차용박사 로고" src="./asset/ChayongBanner.png">

> **AI가 만드는 신뢰성 있는 차용증, 에스크로로 안전한 금전 거래**  
> **개발기간: 2024.08.19 ~ 2024.10.11 (7주)**
</div>

## 📌 프로젝트 소개

### 🌟 기획 배경
현대 사회에서 개인 간 금전 거래는 일상적인 일이 되었지만, 여전히 많은 위험과 불편함을 동반합니다. 수기로 작성된 차용증은 법적 효력이 불확실하고, 개인 간 거래는 안전성을 보장받기 어려우며, 채무 불이행 시 적절한 대응 방안을 찾기 어렵습니다. 또한, 상환 일정과 내역 관리가 체계적으로 이루어지지 않아 분쟁의 소지가 높아지고 있습니다. 💸

특히 분할 상환의 경우, 매번 수기로 상환 내역을 기록하고 관리해야 하는 번거로움이 있으며, 종종 기록 누락이나 오류로 이어져 당사자 간 신뢰 관계를 해치는 원인이 되고 있습니다. 기존의 수기 장부 방식으로는 거래의 투명성을 보장하기 어렵고, 실시간으로 상환 현황을 확인하는 것도 현실적으로 불가능합니다. 📝

이러한 문제들을 해결하기 위해 차용박사는 AI 기술과 에스크로 시스템을 결합한 혁신적인 P2P 대출 중개 플랫폼을 제시합니다. 법적 효력이 있는 전자 차용증 발행부터 안전한 거래 시스템, 자동화된 상환 관리까지, 개인 간 금전 거래에 필요한 모든 요소를 포괄적으로 제공합니다. 🌟

차용박사는 단순한 금전 거래 플랫폼을 넘어, 개인 간 금전 거래의 새로운 패러다임을 제시합니다. 신뢰성, 안전성, 편의성을 핵심 가치로 삼아, 모든 사용자가 안심하고 이용할 수 있는 서비스를 만들어가고 있습니다. 앞으로도 차용박사는 사용자들의 피드백을 반영하며 지속적으로 서비스를 개선하여, 더 나은 금전 거래 문화를 만들어 나가겠습니다. 💪


### 🎯 프로젝트 목표

1. **안전한 금전 거래 플랫폼 구축**
  - 법적 효력이 있는 전자 차용증 발행
  - 에스크로 기반의 안전한 거래 시스템 구현
  - 실시간 자동화된 거래 처리

2. **사용자 중심의 서비스 제공**
  - 직관적인 거래 현황 대시보드
  - 자동화된 상환 일정 관리
  - 실시간 알림 서비스

3. **투명한 거래 관리 시스템**
  - 체계적인 거래 내역 관리
  - 실시간 상환 현황 조회
  - 자동화된 거래 명세서 발행

### 💻 프로젝트 기간 및 인원

- **기간**: 2024.08.19 ~ 2024.10.11 (7주)
- **인원**: 6명
 - Backend: 4명
 - Frontend: 2명
 - 인프라/DevOps: 1명 (Backend 겸임)

## 🛠️ 기술 스택

### Backend
![Java](https://img.shields.io/badge/Java_17-007396?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot_3.3.1-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=spring-security&logoColor=white)
![JPA](https://img.shields.io/badge/JPA-59666C?style=for-the-badge&logo=hibernate&logoColor=white)
![Spring Batch](https://img.shields.io/badge/Spring_Batch-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Spring Validation](https://img.shields.io/badge/Spring_Validation-6DB33F?style=for-the-badge&logo=spring&logoColor=white)

### Database
![Redis](https://img.shields.io/badge/Redis-DC382D?style=for-the-badge&logo=redis&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)

### DevOps & Infrastructure
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![Jenkins](https://img.shields.io/badge/Jenkins-D24939?style=for-the-badge&logo=jenkins&logoColor=white)
![Nginx](https://img.shields.io/badge/nginx-%23009639.svg?style=for-the-badge&logo=nginx&logoColor=white)
![AWS EC2](https://img.shields.io/badge/Amazon%20EC2-FF9900?style=for-the-badge&logo=Amazon%20EC2&logoColor=white)
![Grafana](https://img.shields.io/badge/grafana-%23F46800.svg?style=for-the-badge&logo=grafana&logoColor=white)

### Tools & Communication
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![GitLab](https://img.shields.io/badge/GitLab-FCA121?style=for-the-badge&logo=gitlab&logoColor=white)
![Jira](https://img.shields.io/badge/Jira-0052CC?style=for-the-badge&logo=jira&logoColor=white)
![Notion](https://img.shields.io/badge/Notion-000000?style=for-the-badge&logo=notion&logoColor=white)

## 💪 주요 기능

### ⭐️ 차용증 생성 및 관리
- 채권자와 채무자 간 전자 차용증 계약 체결
- 1:1 가상계좌 자동 발급 및 연동
- 차용증 상태 자동 관리 (작성중, 진행중, 완료)
- PDF 형식의 차용증 출력 기능

### ⭐️ 자동화된 거래 프로세스
#### 거래 프로세스 상세 흐름

(여기 ```)
1. 채무자 계좌 -> 가상계좌 이체
2. 이체 성공 시 자동 처리:
  - 잔액 갱신 (차용증, 가상계좌)
  - 거래 내역 저장
  - 입금 이벤트 발행
3. 가상계좌 -> 채권자 계좌 자동 이체
(여기 ```)

#### 🔍 핵심 기능
1. **실시간 거래 처리**
  - 이벤트 기반 입금 처리 시스템
  - 비동기 이벤트 처리로 성능 최적화
  - 실시간 잔액 갱신 및 상태 관리

2. **안전한 에스크로 시스템**
  - 가상계좌를 통한 안전한 중개
  - 자동화된 이체 프로세스
  - 트랜잭션 관리를 통한 데이터 정합성 보장

3. **거래 내역 관리**
  - 실시간 거래 현황 조회
  - 상세 거래 내역 기록
  - 거래 명세서 자동 생성

### ⭐️ 알림 시스템
- 상환 일정 자동 알림
- 입금 확인 실시간 알림
- 거래 상태 변경 알림

### ⭐️ 데이터 시각화
- 거래 현황 대시보드
- 상환 일정 캘린더
- 거래 통계 리포트
