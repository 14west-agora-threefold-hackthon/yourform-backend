package com.agora.yourform.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.agora.yourform.YourFormApplication;
import com.agora.yourform.model.controller.response.UserInfo;

@Repository
@Profile(YourFormApplication.DYNAMIC_LOOKUP_PROFILE)
public class LookupUserDaoImpl implements UserDao {

	private final JdbcTemplate jdbcTemplate;

	private final Environment environment;

	public LookupUserDaoImpl(JdbcTemplate jdbcTemplate, Environment environment) {
		this.jdbcTemplate = jdbcTemplate;
		this.environment = environment;
	}

	@Override
	public UserInfo getUserInfoById(Integer id) {
		return jdbcTemplate.queryForObject(
				String.format(environment.getRequiredProperty("jdbc.database.query.getuserinfobyid"), id),
				new RowMapper<UserInfo>() {
					@Override
					public UserInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
						UserInfo userInfo = new UserInfo();

						userInfo.setLocation(rs.getString("location"));
						userInfo.setDevice(rs.getString("device"));
						userInfo.setShortVideoPastViewTimeSeconds(rs.getInt("short_video_past_view_time_seconds"));
						userInfo.setLongVideoPastViewTimeSeconds(rs.getInt("long_video_past_view_time_seconds"));
						userInfo.setShortContentPastViewTimeSeconds(rs.getInt("short_content_past_view_time_seconds"));
						userInfo.setLongContentPastViewTimeSeconds(rs.getInt("long_content_past_view_time_seconds"));
						userInfo.setShortAudioPastViewTimeSeconds(rs.getInt("short_audio_past_view_time_seconds"));
						userInfo.setLongAudioPastViewTimeSeconds(rs.getInt("long_audio_past_view_time_seconds"));

						return userInfo;
					}
				});
	}
}