-- Answer (a):
SELECT videos.*, subtitles.language
FROM videos
INNER JOIN subtitles ON videos.id = subtitles.video_id
WHERE LOWER(subtitles.language) = 'indonesia'

-- Answer (b):
SELECT videos.*, subtitles.language
FROM videos
INNER JOIN subtitles ON videos.id = subtitles.video_id
WHERE LOWER(subtitles.language) = 'indonesia'
AND videos.published_at BETWEEN ('now'::timestamp - '3 hours'::interval) AND 'now'::timestamp
ORDER BY videos.published_at DESC

-- Answer (c):
Add index for 'videos.id', and
Add an composite index for 'subtitles.video_id' and 'subtitles.language' columns.
