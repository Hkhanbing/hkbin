text = r'<div class="form-group"><label for="captcha1">63849148713297350696524669173405255292+148577853852152897915260706805067461961 的结果是？</label><input type="text" class="form-control" id="captcha1" name="captcha1" placeholder="请输入结果"></div>'
import re

obj = re.compile(r'(?P<first>.*?)+(?P<second>.*?) 的结果是?', re.S)

obj.findall(text)
