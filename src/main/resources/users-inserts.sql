CREATE TABLE IF NOT EXISTS users (
	id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	location STRING,
	device STRING,
	short_video_past_view_time_seconds INTEGER DEFAULT 0,
	long_video_past_view_time_seconds INTEGER DEFAULT 0,
	short_content_past_view_time_seconds INTEGER DEFAULT 0,
	long_content_past_view_time_seconds INTEGER DEFAULT 0,
	short_audio_past_view_time_seconds INTEGER DEFAULT 0,
	long_audio_past_view_time_seconds INTEGER DEFAULT 0
);

DELETE FROM users;

INSERT INTO users (
	id,
	location,
	device,
	short_video_past_view_time_seconds,
	long_video_past_view_time_seconds,
	short_content_past_view_time_seconds,
	long_content_past_view_time_seconds,
	short_audio_past_view_time_seconds,
	long_audio_past_view_time_seconds
) VALUES (
	1,
	'New York City, NY',
	'mobile',
	0,
	4,
	0,
	2,
	0,
	3
),
(
	2,
	'Baltimore, MD',
	'mobile',
	4,
	0,
	2,
	0,
	3,
	0
),
(
	3,
	'Sacramento, CA',
	'mobile',
	5,
	0,
	0,
	0,
	0,
	0
),
(
	4,
	'Austin, TX',
	'mobile',
	0,
	0,
	0,
	0,
	5,
	1
);