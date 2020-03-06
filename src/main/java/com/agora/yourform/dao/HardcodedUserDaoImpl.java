package com.agora.yourform.dao;

import java.util.Map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.google.common.collect.ImmutableMap;

import com.agora.yourform.YourFormApplication;
import com.agora.yourform.model.controller.response.UserCallInfo;
import com.agora.yourform.model.controller.response.UserCallInfoField;
import com.agora.yourform.model.controller.response.UserInfo;
import com.agora.yourform.model.controller.response.builder.UserInfoBuilder;

@Repository
@Profile(YourFormApplication.HARDCODED_LOOKUP_PROFILE)
public class HardcodedUserDaoImpl implements UserDao {

	private static final Object[][] FREQUENT_CALLER_ROWS = new Object[][] {
			new Object[] {
					Integer.valueOf(117),
					"No",
					Double.valueOf(0D),
					Double.valueOf(180.0),
					Double.valueOf(30.0),
					Double.valueOf(20.0),
					Double.valueOf(5.0),
					Double.valueOf(10.0),
					Double.valueOf(2.0),
					Double.valueOf(17.5),
					Double.valueOf(4.0),
					Double.valueOf(20.0),
					Double.valueOf(17.50),
					Double.valueOf(5.0), // High number of phone calls made to call center
					"False"
			}
	};

	private static final Object[][] INFREQUENT_CALLER_ROWS = new Object[][] {
			new Object[] {
					Integer.valueOf(110),
					"No",
					Double.valueOf(0D),
					Double.valueOf(180.0),
					Double.valueOf(30.0),
					Double.valueOf(20.0),
					Double.valueOf(5.0),
					Double.valueOf(10.0),
					Double.valueOf(2.0),
					Double.valueOf(17.5),
					Double.valueOf(4.0),
					Double.valueOf(20.0),
					Double.valueOf(17.50),
					Double.valueOf(1.0), // Low number of phone calls made to call center
					"False"
			}
	};

	private static final UserCallInfo CALL_INFO_SCHEMA = new UserCallInfo(new UserCallInfoField[] {
			new UserCallInfoField("integer","len"),
			new UserCallInfoField("string","intlplan"),
			new UserCallInfoField("double","numvmail"),
			new UserCallInfoField("double","tdmins"),
			new UserCallInfoField("double","tdcalls"),
			new UserCallInfoField("double","temins"),
			new UserCallInfoField("double","tecalls"),
			new UserCallInfoField("double","tnmins"),
			new UserCallInfoField("double","tncalls"),
			new UserCallInfoField("double","tncharge"),
			new UserCallInfoField("double","timins"),
			new UserCallInfoField("double","ticalls"),
			new UserCallInfoField("double","ticharge"),
			new UserCallInfoField("double","numcs"),
			new UserCallInfoField("string","churn")
	});

	private final Map<Integer, UserInfo> USER_INFO_MAP = ImmutableMap.<Integer, UserInfo>builder()
			.put(1, new UserInfoBuilder() // Long content preferred
					.setDevice("mobile")
					.setLocation("New York City, NY")
					.setLongContentPastViewTimeSeconds(2)
					.setLongAudioPastViewTimeSeconds(3)
					.setLongVideoPastViewTimeSeconds(4)
					.setRows(INFREQUENT_CALLER_ROWS)
					.setSchema(CALL_INFO_SCHEMA)
					.build())
			.put(2, new UserInfoBuilder() // Short content preferred
					.setDevice("mobile")
					.setLocation("Baltimore, MD")
					.setShortContentPastViewTimeSeconds(2)
					.setShortAudioPastViewTimeSeconds(3)
					.setShortVideoPastViewTimeSeconds(4)
					.setRows(INFREQUENT_CALLER_ROWS)
					.setSchema(CALL_INFO_SCHEMA)
					.build())
			.put(3, new UserInfoBuilder() // Short video only
					.setDevice("mobile")
					.setLocation("Sacramento, CA")
					.setShortVideoPastViewTimeSeconds(5)
					.setRows(INFREQUENT_CALLER_ROWS)
					.setSchema(CALL_INFO_SCHEMA)
					.build())
			.put(4, new UserInfoBuilder() // Audio only
					.setDevice("mobile")
					.setLocation("Austin, TX")
					.setShortAudioPastViewTimeSeconds(5)
					.setLongAudioPastViewTimeSeconds(1)
					.setRows(FREQUENT_CALLER_ROWS)
					.setSchema(CALL_INFO_SCHEMA)
					.build())
			.build();

	@Override
	public UserInfo getUserInfoById(Integer id) {
		if (USER_INFO_MAP.containsKey(id)) {
			return USER_INFO_MAP.get(id);
		}

		// Default values; no previous content viewership history
		return new UserInfo();
	}

	@Override
	public void createUser(UserInfo userInfo) {
	}
}
